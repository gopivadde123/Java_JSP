package com.gv.JobApp.repo;

import com.gv.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {
    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(
                    1,
                    "Java Developer",
                    "Must have good experience in Core Java, Spring Boot, REST APIs and MySQL.",
                    3,
                    Arrays.asList("Java", "Spring Boot", "MySQL", "REST API")
            ),

            new JobPost(
                    2,
                    "Frontend Developer",
                    "Experience in building responsive web applications using Angular.",
                    2,
                    Arrays.asList("Angular", "TypeScript", "HTML", "CSS", "JavaScript")
            ),

            new JobPost(
                    3,
                    "Full Stack Developer",
                    "Strong knowledge of Java, Spring Boot and Angular.",
                    4,
                    Arrays.asList("Java", "Spring Boot", "Angular", "SQL")
            ),

            new JobPost(
                    4,
                    "React Developer",
                    "Experience in developing scalable React applications.",
                    2,
                    Arrays.asList("React", "JavaScript", "Redux", "CSS")
            ),

            new JobPost(
                    5,
                    "Python Developer",
                    "Experience with Python, Django and REST services.",
                    3,
                    Arrays.asList("Python", "Django", "REST API", "PostgreSQL")
            ),

            new JobPost(
                    6,
                    "Data Scientist",
                    "Strong background in Machine Learning and Data Analysis.",
                    4,
                    Arrays.asList("Python", "Machine Learning", "Pandas", "TensorFlow")
            ),

            new JobPost(
                    7,
                    "DevOps Engineer",
                    "Experience in CI/CD pipelines and cloud deployments.",
                    5,
                    Arrays.asList("Docker", "Kubernetes", "AWS", "Jenkins")
            ),

            new JobPost(
                    8,
                    "Cloud Engineer",
                    "Hands-on experience with AWS cloud services.",
                    3,
                    Arrays.asList("AWS", "EC2", "S3", "Lambda")
            ),

            new JobPost(
                    9,
                    "SAP BTP Developer",
                    "Experience in SAP CAPM, SAP HANA Cloud and Fiori.",
                    3,
                    Arrays.asList("SAP BTP", "CAPM", "HANA Cloud", "Fiori")
            ),

            new JobPost(
                    10,
                    "Network Engineer",
                    "Knowledge of routing, switching and network security.",
                    2,
                    Arrays.asList("Cisco", "TCP/IP", "Routing", "Switching")
            )

    ));
    public List<JobPost> getAllJobs(){
       return jobs;
    }
    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println("This is from repo :"+jobs);
    }
}
