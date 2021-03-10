package examples;

import bootcamp.TokenContract;
import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.CommandWithParties;
import net.corda.core.contracts.Contract;
import net.corda.core.contracts.ContractState;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.corda.core.contracts.ContractsDSL.requireSingleCommand;
import static net.corda.core.contracts.ContractsDSL.requireThat;

public class PatientContract implements Contract {
    @Override
    public void verify(@NotNull LedgerTransaction tx) throws IllegalArgumentException {
        CommandWithParties<PatientContract.Commands> command =
                requireSingleCommand(tx.getCommands(), PatientContract.Commands.class);


        if (!(command.getValue() instanceof  Commands.Issue)) {
            throw new IllegalArgumentException("tx must be a type issue");
        } else {

        }
//        List<ContractState> inputs = tx.getInputStates();
//        List<ContractState> outputs = tx.getOutputStates();
//
//        // grab all the commands
//        List<CommandWithParties<CommandData>> commands = tx.getCommands();
//        // filter the commands to make sure there is one command for a particular state
//        // and to see the command of the particular type
//        // in this case it will be an issue command
//        if(commands.size() != 1) throw new IllegalArgumentException("tx should only have 1 command");
//        if(!(commands.get(0).getValue() instanceof PatientContract.Commands.Issue))
//            throw new IllegalArgumentException("tx must be a type issue");
//
//        CommandData theCommand = commands.get(0).getValue();
//
//        // shape of the transactions
//        if(inputs.size() != 0) throw new IllegalArgumentException("must have zero inputs");
//        if(outputs.size() != 1) throw new IllegalArgumentException("must have one output");
//
//        if(!(outputs.get(0) instanceof  PatientState ))
//            throw new IllegalArgumentException("output must be of type PatientState");
//
//        PatientState patientState = (PatientState) outputs.get(0);
//
//        // check if content is good
//        if(!(patientState.getPatientName().equals()))



    }

    public interface Commands extends CommandData {
        class Issue implements PatientContract.Commands {
        }
    }
}
