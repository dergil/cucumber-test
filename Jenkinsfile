pipeline {
    agent any

    parameters {
        choice(
            name: 'TAGS_TO_RUN',
            choices: "@addition @subtraction @multiplication @division",
            description: 'Choose the tags to execute'
        )
    }

    stages {
        stage('Build') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh "./gradlew test -Dcucumber.filter.tags='${params.TAGS_TO_RUN}'"
            }
        }
    }

    post {
        always {
            // Publish Cucumber JSON report
            cucumber jsonReportDirectory: 'target/cucumber-reports'
        }
    }
}
