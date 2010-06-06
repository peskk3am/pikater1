package ontology.messages;
import jade.content.Concept;
import jade.util.leap.List;

public class Results implements Concept{

		private String _problem_id;
		private String _computation_id;
		private List _results;
		
		public void setProblem_id(String problem_id) {
			_problem_id=problem_id;
		}
		public String getProblem_id() {
			return _problem_id;
		}

		public void setComputation_id(String computation_id) {
			_computation_id=computation_id;
		}
		public String getComputation_id() {
			return _computation_id;
		}

		public void setResults(List results) {
			_results=results;
		}
		public List getResults() {
			return _results;
		}

}