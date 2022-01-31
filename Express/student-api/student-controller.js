const { report } = require('process');
const StudentService = require('./student-service');
const port = 3000;
class StudentController {
    service = new StudentService();
    constructor(app) {
        this.app = app;
        this.initRoutes();
    }
    initRoutes() {
        this.app.get('/',(req,resp) => {
            resp.send("this is student controller");
        });

        this.app.get("/api/v1/student",async (req,resp) => {
            const student = await this.service.getStudents();
            resp.json(student);
        });

        this.app.post("/api/v1/student",async (req,resp) => {
            const student = req.body;
            await this.service.add(student);
            resp.json(student.id);
        });

        this.app.listen(port,()=> {

        })
    }
}