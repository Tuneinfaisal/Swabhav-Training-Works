const ContactService = require("./contact-service");
const Contact = require("./contact");
const ContactMySqlRepository = require("./contact-mysql-repository");
const ContactMongoDbRepository = require("./contact-mongoDB-repository");

module.exports = function (app) {
    const contactService1 = new ContactService(new ContactMySqlRepository());
    // const contactService2 = new ContactService(new ContactMongoDbRepository());

    app.get("/api/v1/contacts", async (req, res) => {
        let contacts1 = await contactService1.getContacts();
        res.json(contacts1);

        // let contacts2 = await contactService2.getContacts();
        // res.json(contacts2);
    });

    app.post("/api/v1/contacts", async (req, res) => {
        const contact1 = new Contact(
            req.body.id,
            req.body.firstName,
            req.body.lastName,
            req.body.email,
            req.body.phone
        );
        await contactService1.addContact(contact1);
        res.json(contact1);

        // const contact2 = new Contact(
        //     req.body.id,
        //     req.body.firstName,
        //     req.body.lastName,
        //     req.body.email,
        //     req.body.phone
        // );
        // await contactService.addContact2(contact2);
        // res.json(contact2);
    });
};
