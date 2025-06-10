package sprint_1.task_09

class StudentDatabase {
    private var students = mutableMapOf<Student, MutableMap<Subject, Int>>()
    private var subjects = mutableMapOf<Subject, MutableList<Student>>()

    fun addNewStudent(studentName: String, marks: MutableMap<Subject, Int>) {
        checkStudentExistance(studentName)

        val student = Student(studentName)
        students[student] = marks
        marks.forEach { (subject, _) ->
            val studentList = subjects.getOrPut(subject) { mutableListOf() }
            studentList.add(student)
        }
    }

    fun addSubject(studentName: String, subject: Subject, mark: Int) {
        var student: Student? = null
        for (key in students.keys) {
            if (key.name == studentName) {
                student = key
            }
        }

        if (student == null) {
            throw Exception("Student with $studentName doesn't exist")
        }

        val subjectToMark = students[student]
        subjectToMark?.set(subject, mark)

        subjects.getOrPut(subject) { mutableListOf() }.add(student)
    }

    /**
     * Проверка присутствия студента в базе
     */
    private fun checkStudentExistance(studentName: String) {
        for (student in students.keys) {
            if (student.name == studentName) {
                throw Exception("Student with $studentName already exists")
            }
        }
    }

    fun getStudents(): Map<Student, Map<Subject, Int>> {
        return students
    }

    fun getSubjects(): Map<Subject, MutableList<Student>> {
        return subjects
    }
}