
<!--
   freemarker macros have to be imported into a namespace.
   We strongly recommend sticking to 'spring'
   -->
 
<#import "/spring.ftl" as spring/>
 
<html>
   <head>
      <title>Add Person</title>
   </head>
   <body>
      <#if errorMessage??>
      <div style="color:red;font-style:italic;">
         ${errorMessage}
      </div>
      </#if>
      
      <div>
         <fieldset>
            <legend>Add Student</legend>
            <form name="person" action="" method="POST">
            
               Full Name: <@spring.formInput "studentForm.fullName" "" "text"/>    <br/>
               Point One: <@spring.formInput "studentForm.pointOne" "" "float"/>    <br/>
               Point Two: <@spring.formInput "studentForm.pointTwo" "" "float"/>    <br/>
               Point Three: <@spring.formInput "studentForm.pointThree" "" "float"/>    <br/>
               
               <input type="submit" value="Create" />
            </form>
         </fieldset>
      </div>
      
      
   </body>
   
</html>