package memento;

public class Client {

	public static void main(String[] args) {
		VersionHolder versionHolder = new VersionHolder();
		
		VersionCreator versionCreator = new VersionCreator();
		
		Document document;
		
		document= new Document("Se tiene una base de datos", "Benjamin Soto", "DOC-1");
		versionCreator.setState(document);
		versionHolder.addMemento(versionCreator.createMemento());
		
		document= new Document("Se tiene dos bases de datos", "Benjamin Soto", "DOC-1");
		versionCreator.setState(document);
		versionHolder.addMemento(versionCreator.createMemento());
		
		document= new Document("Se tiene tres bases de datos", "Benjamin Soto", "DOC-1");
		versionCreator.setState(document);
		versionHolder.addMemento(versionCreator.createMemento());
		
		document= new Document("Se tiene cuatro bases de datos", "Benjamin Soto", "DOC-1");
		versionCreator.setState(document);
		versionHolder.addMemento(versionCreator.createMemento());
		
		document= new Document("Se tiene cinco bases de datos", "Benjamin Soto", "DOC-1");
		versionCreator.setState(document);
		versionHolder.addMemento(versionCreator.createMemento());
		
		versionCreator.revertir(versionHolder);
		versionCreator.revertir(versionHolder);
		versionCreator.revertir(versionHolder);
		versionCreator.revertir(versionHolder);
		System.out.println(">>>>>>>>>>>");
		
		versionCreator.deshacer(versionHolder);
		versionCreator.deshacer(versionHolder);
		versionCreator.deshacer(versionHolder);
		versionCreator.deshacer(versionHolder);
		

		
		
	}

}
