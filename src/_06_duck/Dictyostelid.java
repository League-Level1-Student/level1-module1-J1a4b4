package _06_duck;

public class Dictyostelid {
int colonyPopulation;
boolean dispersed;
void disperse() {
if (dispersed == false) {
dispersed = true;
System.out.println("The colony has been dispersed.");
}else if (dispersed == true) {
System.out.println("The colony is already dispersed.");
}
}
void regroup() {
if (dispersed == true) {
dispersed = false;
System.out.println("The colony has regrouped.");
}else if (dispersed == false) {
System.out.println("The colony is already regrouped.");
}
}
Dictyostelid(int colonyPopulation, boolean dispersed){
this.colonyPopulation = colonyPopulation;
this.dispersed = dispersed;
}
}
