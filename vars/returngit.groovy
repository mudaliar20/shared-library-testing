def call() {
        def gitcommit = sh(returnStdout: true,script: 'git show -s --format=format:"%s"').trim()
		return gitcommit
}
