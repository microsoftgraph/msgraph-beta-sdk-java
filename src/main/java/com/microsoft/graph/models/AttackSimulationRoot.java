package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the attackSimulation property of the microsoft.graph.security entity. */
public class AttackSimulationRoot extends Entity implements Parsable {
    /** Represents simulation automations created to run on a tenant. */
    private java.util.List<SimulationAutomation> _simulationAutomations;
    /** Represents an attack simulation training campaign in a tenant. */
    private java.util.List<Simulation> _simulations;
    /**
     * Instantiates a new attackSimulationRoot and sets the default values.
     * @return a void
     */
    public AttackSimulationRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationRoot
     */
    @javax.annotation.Nonnull
    public static AttackSimulationRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttackSimulationRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("simulationAutomations", (n) -> { currentObject.setSimulationAutomations(n.getCollectionOfObjectValues(SimulationAutomation::createFromDiscriminatorValue)); });
            this.put("simulations", (n) -> { currentObject.setSimulations(n.getCollectionOfObjectValues(Simulation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the simulationAutomations property value. Represents simulation automations created to run on a tenant.
     * @return a simulationAutomation
     */
    @javax.annotation.Nullable
    public java.util.List<SimulationAutomation> getSimulationAutomations() {
        return this._simulationAutomations;
    }
    /**
     * Gets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @return a simulation
     */
    @javax.annotation.Nullable
    public java.util.List<Simulation> getSimulations() {
        return this._simulations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("simulationAutomations", this.getSimulationAutomations());
        writer.writeCollectionOfObjectValues("simulations", this.getSimulations());
    }
    /**
     * Sets the simulationAutomations property value. Represents simulation automations created to run on a tenant.
     * @param value Value to set for the simulationAutomations property.
     * @return a void
     */
    public void setSimulationAutomations(@javax.annotation.Nullable final java.util.List<SimulationAutomation> value) {
        this._simulationAutomations = value;
    }
    /**
     * Sets the simulations property value. Represents an attack simulation training campaign in a tenant.
     * @param value Value to set for the simulations property.
     * @return a void
     */
    public void setSimulations(@javax.annotation.Nullable final java.util.List<Simulation> value) {
        this._simulations = value;
    }
}
