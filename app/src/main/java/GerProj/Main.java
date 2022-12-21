/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GerProj;

import GerProj.controller.ProjectController;
import GerProj.controller.TaskController;
import GerProj.model.Project;
import GerProj.model.Task;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws SQLException  {
        System.out.println(new Main().getGreeting());
        
      
    ProjectController projectController = new ProjectController();
     
     Project project = new Project();
     project.setName("Projeto Teste 02 ");    
     project.setDescription("Adriano");
     project.setCreatedAt(new Date());
     project.setUpdatedAt(new Date());
     projectController.save(project);
            
    //System.out.println("teste do erro");
    project.setId(15);
    project.setName("Adriano Dezembro");
    project.setDescription("Description");
    project.setCreatedAt(new Date());
    project.setUpdatedAt(new Date());
    projectController.update(project);
            
    System.out.println("Projeto atualizado");
            
    List<Project> projects = projectController.getAll();
    System.out.println("Total de Projetos = " +projects.size());
            
            
    TaskController taskController = new TaskController();
            
    Task task = new Task();
    task.setIdProject(14);
    task.setName("Criar tela de aplica��o");
    task.setDescription("Devem ser criadas as telas para cadastros");
    task.setNotes("Sem notas");
    task.setIsCompleted(false);
    task.setDeadLine(new Date());
    task.setCreatedAt(new Date());
    task.setUpdatedAt(new Date());
     System.out.println("Teste da main pra save task") ;      
    
    taskController.save(task);
    
    System.out.println("Teste de save Tasks com sucesso");
            
    //task.setName("Alterar telas de aplica��o");
    //taskController.update(task);
    //List<Task> tasks = taskController.getAll(12);
    //System.out.println("Totel de tarefas = "  +tasks.size());
           
            
            
       
    }
}
