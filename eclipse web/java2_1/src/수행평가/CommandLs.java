package 수행평가;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		File[] listFile = currentDirectory.listFiles();
        BasicFileAttributes FileAttributes = null;
        for (File file : listFile){
            try {
            	FileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
            FileTime time = FileAttributes.creationTime();

            String pattern = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

            String formatted = simpleDateFormat.format( new Date( time.toMillis() ) );
            
            System.out.print(formatted + "     ");

            if (file.isDirectory()){
            	
                System.out.print("<DIR>      ");
 
            }else if(file.isFile()){
            	
                long size = file.length();
                String size_str;
                size_str = Long.toString(size);
                
                if(size / 1024 > 0) {
                	
                    size /= 1024;
                    size_str = Long.toString(size) + "KB";

                    if(size / 1024 > 0) {
                    	
                        size /= 1024;
                        size_str = Long.toString(size) + "MB";

                        if(size / 1024 > 0) {
                        	
                            size /= 1024;
                            size_str = Long.toString(size) + "GB";
                        }
                    }
                }
                System.out.printf("%9s" + "  ",size_str);
            }


            System.out.print(file.getName() + " ");
            System.out.println();
	}
		return currentDirectory;
	}
}
