package Tree;

import java.util.ArrayList;

public class AllPathsToLeaf {
	public static ArrayList<String> allRootToLeaf(BinaryTreeNode<Integer> root) {
		ArrayList<String> pathList = new ArrayList<>();
		paths(root, "", pathList);
		return pathList;
	}

	private static void paths(BinaryTreeNode<Integer> root, String currPath, ArrayList<String> pathList) {
		if (root == null) {
			return;
		}

		if (currPath.isEmpty()) {
			currPath += root.data;
		} else {
			currPath += " " + root.data;
		}

		if (root.left == null && root.right == null) {
			pathList.add(currPath);
		}

		paths(root.left, currPath, pathList);
		paths(root.right, currPath, pathList);
	}
}
