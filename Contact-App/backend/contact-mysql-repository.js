const mysql = require("mysql");
const Contact = require("./contact");

const connection = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "mysql512096",
    database: "contacts",
});

connection.connect(function (err) {
    if (err) throw err;
});

class ContactMySqlRepository {
    addContact(contact) {
        var sql = `INSERT INTO Contact (ID, FNAME, LNAME, EMAIL, PHONE) 
                    VALUES (${contact.id}, '${contact.firstName}', '${contact.lastName}',
                    '${contact.email}', '${contact.phone}')`;

        return new Promise((resolve, reject) => {
            connection.query(sql, (err, res) => {
                if (err) return reject(err);
                resolve(res);
            });
        });
    }

    getContacts() {
        console.log("Connected!");
        let contactList = new Array();

        return new Promise((resolve, reject) => {
            connection.query("SELECT * FROM  Contact", (err, res) => {
                if (err) return reject(err);

                for (let r of res) {
                    let contact = new Contact(
                        r.ID,
                        r.FNAME,
                        r.LNAME,
                        r.EMAIL,
                        r.PHONE
                    );
                    contactList.push(contact);
                }
                resolve(contactList);
            });
        });
    }
}

module.exports = ContactMySqlRepository;
