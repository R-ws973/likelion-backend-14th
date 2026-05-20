package policy;

import role.Role;

public interface SubmissionPolicy {
  String getPolicy(Role role);
}
