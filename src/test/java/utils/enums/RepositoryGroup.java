package utils.enums;

public enum RepositoryGroup {
  GITHUB("com.github");

  private String repositoryGroup;

  RepositoryGroup(String repositoryGroup) {
    this.repositoryGroup = repositoryGroup;
  }

  @Override
  public String toString() {
    return repositoryGroup;
  }
}
