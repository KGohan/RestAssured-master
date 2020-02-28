
public class Tasks {

    /** Task 1
     * create a request to https://httpstat.us/203
     * expect status 203
     * expect content type text
     * **/

    /** Task 2
     * create a request to https://httpstat.us/418
     * expect status 418
     * expect content type text
     * expect body to be equal to "418 I'm a teapot"
     * **/

    /** Task 3
     * create a request to https://jsonplaceholder.typicode.com/todos/2
     * expect status 200
     * expect content type json
     * expect title in response body to be "quis ut nam facilis et officia qui"
     * **/

    /** Task 4
     * create a request to https://jsonplaceholder.typicode.com/todos/2
     * expect status 200
     * expect content type json
     * expect response completed status to be false
     * **/

    /** Task 5
     * create a request to https://reqres.in/api/users?page=2
     * expect status 200
     * expect content type json
     * expect data to contain first name "George"
     * **/

    /**Task 6
            * create a request to https://jsonplaceholder.typicode.com/todos/2
            * expect status 200
            * expect content type json
     * create a pojo and extract it from response body
     * expect completed property of your pojo to be false
            **/

    /**Task 7
            * create a request to https://reqres.in/api/users?page=2
            * expect status 200
            * expect content type json
     * create a pojos to extract response body
     * expect "data" property of your pojo to be not empty
     **/
}