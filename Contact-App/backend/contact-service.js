// const Contact = require('./contact');

class ContactService{

    constructor(contactDbRepo,contactMongoRepo){
        this.contactDbRepo = contactDbRepo;
        this.contactMongoRepo = contactMongoRepo;
    }

    getContacts(){
        return this.contactDbRepo.getContacts();
        return this.contactMongoRepo.getContacts();
    }

    addContact(contact){
        return this.contactDbRepo.addContact(contact);
        return this.contactMongoRepo.getContacts(contact);
    }

}

module.exports = ContactService;
