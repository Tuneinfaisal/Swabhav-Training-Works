const express = require("express");
const cors = require("cors");
const app = express();
const ContactController = require("./contact-controller");

const swaggerJSDoc = require("swagger-jsdoc");
const swaggerUI = require("swagger-ui-express");

const port = 9000;

app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(cors());

// app.use(express.static(__dirname + "/public"));

new ContactController(app);

app.listen(port, (err) => {
    if (err) {
        console.log(err);
        return;
    }
    console.log(`Server is running at port ${port}`);
});

const swaggerOptions = {
    swaggerDefinition: {
        info: {
            title: "Contact-app",
            version: "1.0.0",
        },
    },
    apis: ["index.js"],
};
const swaggerDocs = swaggerJSDoc(swaggerOptions);
app.use("/api-docs", swaggerUI.serve, swaggerUI.setup(swaggerDocs));

/**
 * @swagger
 * /api/v1/contacts:
 *   get:
 *     description: Get all contacts
 *     responses:
 *       200:
 *         description: Success
 *
 */
app.get("/api/v1/contacts", (req, res) => {
    res.send();
});

/** 
 * @swagger 
 * /api/v1/contacts: 
 *   post: 
 *     description: Create contact
 *     parameters: 
 *     - name: EmployeeName 
 *       description: Create an new employee 
 *       in: formData 
 *       required: true 
 *       type: String 
 *     responses:  
 *       201: 
 *         description: Created  
 *   
 */  
 app.post('/api/v1/contacts',(req,res)=>{  
   res.status(201).send();  
});  
