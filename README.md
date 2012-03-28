Wiki based on Markdown syntax that integrates with Dropbox in order to support writing books for LeanPub (see http://www.LeanPub.com).

IntelliJ IDEA Setup:

Make sure you have added `;?*.story` to the end of the Resource Patterns under Settings > Compiler so that IDEA will copy over the story files to where the .class files are.
This is due to the following configuration of JBehave:

`.useStoryLoader(new LoadFromClasspath(this.getClass()))`
