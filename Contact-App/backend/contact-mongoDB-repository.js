const mongoose = require("mongoose");
const Contact = require("./contact");
const url = "mongodb://localhost:9000/api/v1/contacts";

mongoose.connect(url, { useNewUrlParser: true });
const connection = mongoose.connection;

connection.on("open", () => {
    console.log("connected");
});

const studentSchema = new mongoose.Schema({
    ID: {
        type: Number,
        required: true,
    },
    FNAME: {
        type: String,
        required: true,
    },
    LNAME: {
        type: String,
        required: true,
    },
    EMAIL: {
        type: String,
        required: true,
    },
    PHONE: {
        type: Number,
        required: true,
    },
});

class ContactMongoDbRepository {
    addContact(contact) {
        const cont = new studentSchema({
            ID: contact.id,
            FNAME: contact.firstName,
            LNAME: contact.lastName,
            EMAIL: contact.email,
            PHONE: contact.phone,
        });
        cont.save();
    }
    getContacts() {
        studentSchema.find();
    }
}

module.exports = ContactMongoDbRepository;
