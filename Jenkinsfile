pipeline {
  agent any
  stages {
    stage('projekt') {
      steps {
        bat 'mvn -DskipTests clean'
      }
    }

    stage('compile_cucumber') {
      steps {
        bat 'mvn -DskipTests compile'
      }
    }

  }
}