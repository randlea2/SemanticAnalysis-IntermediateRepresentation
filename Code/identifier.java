/* Generated By:JJTree: Do not edit this line. identifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class identifier extends SimpleNode {
  public identifier(int id) {
    super(id);
  }

  public identifier(CALLanguage p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CALLanguageVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=28a8ef12091c43c8e81d3325cdce3893 (do not edit this line) */