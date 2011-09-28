# Require rubygems if necessary
require 'rubygems'

# Require the Gollum library
require 'gollum'

# Create a new Gollum::Wiki object by initializing it with the path to the
# Git repository.
wiki = Gollum::Wiki.new("my-gollum-repo.git")
# => <Gollum::Wiki>

WebSockets and Java EE
======================

This project is just a prototype/proposal for how WebSocket based applications could be standardized
inside a Java EE container.  It is by no means exhaustive nor complete.  What I hope to show here is
how I've been envisioning this working over the last two years I've spent implementing the Grizzly
and GlassFish support.  It is heavily influenced by the API I've built, of course.  That said, for
me this is a starting point not a final recommendation.  I do feel that it's a better basis than
binding any WebSocket JSR to the Servlet specification directly.  For more details, please see my
blog at http://antwerkz.com/websockets-and-java-ee/