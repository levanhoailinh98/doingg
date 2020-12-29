<!DOCTYPE html>
<html>
   <head>
      <title>Student List</title>
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   </head>  
   <body>
     <h3>Person List</h3>
     <a href="addStudent">Add Student</a> |
      <button id= "largestGPA">List Student Largest GPA</button>
     <br><br>
      <div>
         <table id= "studentTable" border="1">
            <tr>
               <th>Name</th>
               <th>Point one</th>
               <th>Point two</th>
               <th>Point three</th>
               <th>Point GPA</th>
            </tr>
            <#list students as student>
            <tr>
               <td>${student.fullName}</td>
               <td>${student.pointOne}</td>
               <td>${student.pointTwo}</td>
               <td>${student.pointThree}</td>
               <td>${student.pointGPA}</td>
            </tr>
            </#list>
         </table>
      </div>
   </body>
   <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
   <script type="text/javascript">
	   $(document).ready(function(){
		document.getElementById("largestGPA").addEventListener("click", 
				function (e){					
					$.ajax({
						type: "GET",
				        url: 'getStudents',
				        contentType: "application/json; charset=utf-8",
				        dataType: "json",
				        cache: false,
				        success: function(data){
				        	$("#studentTable").find("tr:not(:first)").remove();
				        	var trHTML = '';
				        	$.each(data,function(i,student){
							    $("#studentTable tbody").append(
							        "<tr>"
							            +"<td>"+student.fullName+"</td>"
							            +"<td>"+student.pointOne+"</td>"
							            +"<td>"+student.pointTwo+"</td>"
							            +"<td>"+student.pointThree+"</td>"
							            +"<td>"+student.pointGPA+"</td>"
							        +"</tr>" )
							});
							$('#studentTable').append(trHTML);
				        },
				        error: function(msg) {
				            alert(msg.responseText);
				        }
					})
				})
			})
   </script>
</html>