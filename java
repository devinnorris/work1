<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>Artwork Techniques</title>

<link href="css/style1.css" rel="stylesheet" type="text/css" />

</head> 
<body class="page" id="top"> 
	<header>
	<h1>HTML 5 Forms</h1> 
	</header>
	<nav id="navigation" role="navigation">
		<ul>
			<li><a href="index.html">Home</a></li>
			<li><a href="#">About us</a></li>
			<li><a href="gallery.html">Gallery</a></li>
			<li><a href="#">FAQ</a></li>
			<li><a href="forms.html">html5 Forms</a></li>  
		</ul>
		<h2>main navigation</h2> 
	</nav>

	<div id="primaryContent">
		<article>	
			<h2>setting up html5 forms</h2>
			
			<h4>using the autofocus attribute</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p><label for="text1">Field 1: </label><input name="Text1" type="text" autofocus /> </p>
				<p><label for="text2">Field 2: </label><input name="Text2" type="text" /> </p>
				<p><label for="text3">Field 3: </label><input name="Text3" type="text" /> </p>
				<input type="submit" value="Hit Me!" />
			</form>
            
            
			<h4>using place holder</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p><label for="text1">first name </label><input name="Text1" type="text"  /> </p>
				<p><label for="text2">last name </label><input name="Text2" type="text" /> </p>
				<p><label for="text3">email </label><input name="Text3" type="text" placeholder="testy@testies.com"/> </p>
				<input type="submit" value="DON'T!" />
			</form>
            
            
            	<h4>pattern</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p>please add your zip code </p>
				<p><label for="text2">zipcode </label><input name="Text2" type="text" placeholder="98104" pattern="^[0-9]{5}$" /> </p>
				<p><label for="text3">email </label><input name="Text3" type="text" /> </p>
				<input type="submit" value="DON'T!" />
			</form>
            
            <h4>required</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p>please sign up here </p>
				<p><label for="text2">first name </label><input name="Text2" type="text" required /> </p>
                
                <p><label for="text2">last name </label><input name="Text2" type="text" /> </p>
                
                <p><label for="text2">age  </label><input name="Text2" type="text" /> </p>
                
				<p><label for="text3">email </label><input name="Text3" type="text" required/> </p>
				<input type="submit" value="DON'T!" />
			</form>
            
            
            
            	<h4>seach field</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p>enter your info </p>
				<p><label for="text2">searching... </label><input name="Text2" type="search" /> </p>
				
				<input type="submit" value="DON'T!" />
			</form>
            
            
            
            	<h4>email</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p>enter your info </p>
				<p><label for="text2">enter email </label><input name="Text2" type="email" /> </p>
				
				<input type="submit" value="DON'T!" />
			</form>
            
            
            	<h4>url</h4>
			<p>add the attribute "autofocus" to the field we want to have the user fill outfirst</p>
            
            
			<form method="get" action="#">
				<p>enter your info </p>
				<p><label for="text2">enter a valid url </label><input name="Text2" type="url" placeholder="http://www.google.com"/> </p>
				
				<input type="submit" value="DON'T!" />
			</form>
            
            
            
            	<h4>phone</h4>
			<p>new for comps</p>
            
            
			<form method="get" action="#">
				<p>enter your info </p>
				<p><label for="text2">your phone </label><input name="Text2" type="tel" placeholder="(222)222-222"/> </p>
				
				<input type="submit" value="DON'T!" />
			</form>
            
            <h4>number</h4>
			<p>using number types with diff. attributes</p>
            
            
			<form method="get" action="#">
				<p>enter your info </p>
				<p><label for="text2">your number </label><input name="Text2" type="number" value="5"/> </p>
                
                <p><label for="text2">your number range </label><input name="Text2" type="number" value="number" min="5" max="20"/> </p>
                
                <p><label for="text2">your number step </label><input name="Text2" type="number" value="5" step="5"/> </p>
                
                 <p><label for="text2">your number float </label><input name="Text2" type="number" value="0.1" min="0.1" max="2.0" step="0.1" /> </p>
                
<!--               check these!!!-->
                
                
               
				
				<input type="submit" value="DON'T!" />
			</form>
            
            
            	<h4>TIME</h4>
			<p>pick the time</p>
            
            
            
            
            
            
            
            
<!--            CHECK THESE!!!-->
            
			<form method="get" action="#">  
				<p>enter your info </p>
				<p><label for="text2">enter a valid url </label><input name="Text2" type="time" value="01:30" step="3600"/> </p>
                
                <p><label for="text2">date time </label><input name="datetime" type="datetime" value="2014-01-12T06:50:00Z"/> </p>
				
                 <p><label for="text2">date time </label><input name="Text2" type="time" value="2014-01-12T06:50:00Z"   />
                     
                        <p><label for="text2">date time local </label><input name="Text2" type="datetime-local" value="2015-12-12T01:20"   />
                
                             <p><label for="text2">week </label><input name="Text2" type="week" value="2016-W07"/> </p>
                
                 <p><label for="text2">month </label><input name="Text2" type="month" value="2017-12"/> </p>
                
                      <p><label for="text2">month (min-max)</label><input name="Text2" type="month" value="2017-12"  min="2017-01" max="2017-12"/> </p>
				
				<input type="submit" value="DON'T!" />
			</form>
            
            
            
            
            
		</article>
		<aside>
			<h2>Artist Links</h2> 
			<p>Artist's work that has inspired me become a better illustrator / painter.<br>
			I find the 16th and 17th centery facinating due to painting the wrong kind of subject could land you in the clutches of the early church's "Holy Inquisition", and be subject to the<a href="http://listverse.com/2013/09/24/10-horrifying-tortures-of-early-christians/"> tools</a> to help change your mind </p>
			<ul>
				<li><a href="http://www.metmuseum.org/toah/hd/crvg/hd_crvg.htm" target="_blank">Caravaggio (Michelangelo Merisi) (1571–1610)</a></li>
				<li><a href="http://www.arthistoryarchive.com/arthistory/baroque/Artemisia-Gentileschi.html" target="_blank">Artemisia Gentileschi</a></li>
				<li><a href="http://en.wikipedia.org/wiki/Frida_Kahlo" target="_blank">Frida Kahlo</a></li>
				<li><a href="http://www.markryden.com/" target="_blank">Mark Ryden</a></li>
				<li><a href="http://www.metmuseum.org/toah/hd/verm/hd_verm.htm" target="_blank">Johannes Vermeer</a></li>
				<li><a href="http://en.wikipedia.org/wiki/Jean-Honor%C3%A9_Fragonard" target="_blank">Jean-Honor Fragonard</a></li>
			</ul>
		</aside>

	</div> <!-- closing primaryContent   -->
	
	<footer>
		<p>
		&copy; Copyright  by jason zeringue
		</p>
	</footer>
</body>
</html>
