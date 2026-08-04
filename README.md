# Programa&ccedil;&atilde;o Orientada a Objetos, Turma S1 2026.2, [IC](http://www.ic.uff.br)/[UFF](http://www.uff.br)

## Links
Turma 2026.2: [Google Sala de Aula](https://classroom.google.com/c/ODcxMjI0Mzg3MDUy), [Frequência](https://docs.google.com/spreadsheets/d/e/2PACX-1vQIc1uBMrMmWVKaXgdVpv9ctmfIUqRYKVat4_jJ1Z0HpOWE4vzVrM-Lo7bQQBIR0noNkvfuSL_EEhN6/pubhtml), [Professor](https://www.ic.uff.br/blog/pessoas/luiz-andre-portes-paes-leme/).

## 1. Introdução a Java

### i. Downloads

- Java: https://www.oracle.com/java/technologies/downloads
- Netbeans: https://netbeans.apache.org/download
- GitHub Desktop: https://desktop.github.com
- Tutorial: https://docs.oracle.com/javase/tutorial


### ii. Hello, World! ([HelloWorld.java](src/main/java/uff/ic/lleme/ed/aulas/java/HelloWorld.java))
```
package uff.ic.lleme.ed.aulas.java;

public class HelloWorld {

    // program startup function
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### iii. Simple Java Program ([JavaProgram.java](src/main/java/uff/ic/lleme/ed/aulas/java/JavaProgram.java))
```
package uff.ic.lleme.ed.aulas.java;

public class JavaProgram {

    // global variable
    public String name = "A generic java program";

    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }

    // function
    public static int fatorial(int n) {
        int fatorial = 1; // local variable
        for (int i = fatorial; i <= n; i++)
            fatorial = fatorial * i;
        return fatorial;
    }
}
```

### iv. Working with objects ([Main.java](src/main/java/uff/ic/lleme/ed/aulas/java/objects/Main.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/objects/User.java))
```
package uff.ic.lleme.ed.aulas.java.objects;

public class Main {

    public static void main(String[] args) {
        // Object (instance) creation with default constructor
        User u1 = new User();
        u1.id = 1;
        u1.name = "Luiz";

        // Object (instance) creation with specific constructor
        User u2 = new User(2, "André");

        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.objects;

// Java Class
public class User {

    // properties
    public int id;
    public String name;

    // default constructor
    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method
    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

}
```

### v. Reading text files ([ReadText.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/ReadText.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/objects/User.java))
```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadText {

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.txt";
        try ( InputStream input = new FileInputStream(filename);) {
            Scanner in = new Scanner(input);
            while (in.hasNext()) {
                User u = new User(in.nextInt(), in.nextLine());
                System.out.println(u.toString());
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.objects;

// Java Class
public class User {

    // properties
    public int id;
    public String name;

    // default constructor
    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method
    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

}

```


### vi. Writing text files ([WriteText.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/WriteText.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/objects/User.java))
```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteText {

    public static void main(String[] args) {
        int count = 0;
        User[] users = new User[100];
        users[count++] = new User(1, "Luiz");
        users[count++] = new User(2, "André");
        users[count++] = new User(3, "Luiz André");

        String filename2 = "src//main//java//uff//ic//lleme//ed//aulas//java//files//report.txt";
        try ( OutputStream out = new FileOutputStream(filename2, false);
                 OutputStreamWriter writer = new OutputStreamWriter(out);
                 BufferedWriter bw = new BufferedWriter(writer);) {
            for (User u : users)
                bw.write(u.toString() + "\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.Serializable;

public class User implements Serializable {

    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=\"%s\"}", id, name);
    }

}
```

### vii. Reading object files ([ReadObject.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/ReadObject.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/User.java))
```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadObject {

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.dat";
        try ( InputStream in = new FileInputStream(filename);
                 ObjectInputStream s = new ObjectInputStream(in);) {
            User[] users = (User[]) s.readObject();
            for (User u : users) {
                if (u == null)
                    break;
                System.out.println(u.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.Serializable;

public class User implements Serializable {

    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

}
```

### viii. Writing object files ([ReadObject.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/WriteObject.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/files/User.java))
```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteObject {

    public static void main(String[] args) {
        int count = 0;
        User[] users = new User[100];
        users[count++] = new User(1, "Luiz");
        users[count++] = new User(2, "André");
        users[count++] = new User(3, "Luiz André");

        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.dat";
        try ( OutputStream out = new FileOutputStream(filename, false);
                 ObjectOutputStream s = new ObjectOutputStream(out);) {
            s.writeObject(users);
            s.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.files;

import java.io.Serializable;

public class User implements Serializable {

    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

}
```

### ix. Inheritance ([Main.java](src/main/java/uff/ic/lleme/ed/aulas/java/inheritance/Main.java), [User.java](src/main/java/uff/ic/lleme/ed/aulas/java/inheritance/User.java), [Person.java](src/main/java/uff/ic/lleme/ed/aulas/java/inheritance/Person.java), [Printable.java](src/main/java/uff/ic/lleme/ed/aulas/java/inheritance/Printable.java))
```
package uff.ic.lleme.ed.aulas.java.inheritance;

public class Main {

    public static void main(String[] args) {
        User u1 = new User(1, "Luiz");
        User u2 = new User(2, "André");

        u1.println();
        u2.println();
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.inheritance;

public class User extends Person implements Printable {

    public int id;

    public User(int id, String name) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("{id:%x, name=%s}", id, name);
    }

    @Override
    public void println() {
        System.out.println(toString());
    }

}
```

```
package uff.ic.lleme.ed.aulas.java.inheritance;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

}
```

```
package uff.ic.lleme.ed.aulas.java.inheritance;

public interface Printable {

    public void println();
}
```

### x. Generics ([Main.java](src/main/java/uff/ic/lleme/ed/aulas/java/generics/Main.java), [CollectionImpl.java](src/main/java/uff/ic/lleme/ed/aulas/java/generics/CollectionImpl.java), [Collection.java](src/main/java/uff/ic/lleme/ed/aulas/java/generics/Collection.java))
```
package uff.ic.lleme.ed.aulas.java.generics;

import uff.ic.lleme.ed.aulas.java.inheritance.User;

public class Main {

    public static void main(String[] args) {
        Collection<User> coll = new CollectionImpl<>();

        User u1 = new User(1, "Luiz");
        User u2 = new User(2, "André");
        coll.add(u1);
        coll.add(u2);

        coll.get(1).println();
    }
}
```

```
package uff.ic.lleme.ed.aulas.java.generics;

import uff.ic.lleme.ed.aulas.java.inheritance.Person;

public class CollectionImpl<E extends Person> implements Collection<E> {

    private Object[] conteudo = new Object[100];

    @Override
    public void add(E element) {
        for (int i = 0; i < conteudo.length; i++)
            if (conteudo[i] == null) {
                conteudo[i] = element;
                return;
            }
        throw new IndexOutOfBoundsException("No available space.");
    }

    @Override
    public E get(int index) {
        return (E) conteudo[index];
    }

    @Override
    public void remove(int index) {
        conteudo[index] = null;
    }

}
```

```
package uff.ic.lleme.ed.aulas.java.generics;

import uff.ic.lleme.ed.aulas.java.inheritance.Person;

public interface Collection<E extends Person> {

    public void add(E element);

    public E get(int index);

    public void remove(int index);
}
```


