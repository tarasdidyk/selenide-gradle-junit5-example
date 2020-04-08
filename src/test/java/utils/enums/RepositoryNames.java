package utils.enums;

public enum RepositoryNames {
  CENTRAL("Central");

  private String repositoryName;

  RepositoryNames(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  @Override
  public String toString() {
    return repositoryName;
  }
}
