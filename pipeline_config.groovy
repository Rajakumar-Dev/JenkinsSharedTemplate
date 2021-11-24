jte{
  allow_scm_jenkinsfile = false
}

@merge libraries{
//merge = true 
initialize
utils
github
}

template_methods
{
  set_agent{}
  git_checkout{}
  build_code{}
  unit_test{}
  publish{}
  deploy{}







}
