pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ahmadbardolia/springboot-ridesapp.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
