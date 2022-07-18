node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'coreutilsport'), string(name: 'DESCRIPTION', 'coreutilsport' )]
        }
}
