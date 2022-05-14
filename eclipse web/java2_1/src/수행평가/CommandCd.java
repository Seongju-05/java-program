package 수행평가;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);

	}

	@Override
	public File executeCommand() {
		File path = new File(currentDirectory + commandLine.substring(commandLine.lastIndexOf(" ")+1,commandLine.length()));
		if(commandLine.substring(commandLine.lastIndexOf(" ")+1,commandLine.length()).equals("..")) {
			return  new File("C:/");
		} else if (path.exists()){
			return path;			
		} else {
			System.out.println("cannot find the path");
			return currentDirectory;
		}
	}
	
}

//cd 잘라서 cd짜른 커멘트 라인을 붙혀서 경로를 만들어야한다.
// 짜른게 .. 다시 뒤로 돌아가고 맞으면 길을 알려주고 그것도 아니면 말 띄어주고 현재 주소 나타내주기
