node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'coreutilsport'), string(name: 'DESCRIPTION', 'The GNU Core Utilities are the basic file, shell and text manipulation utilities of the GNU operating system.' )]
        }
}
