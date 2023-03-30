package org.example;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(Integer.parseInt(System.getenv("PORT")));
        get("/", (req, res) -> "Hello from SparkJava on Azure Apps!");
    }
}