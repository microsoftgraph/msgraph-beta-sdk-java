package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MonitoringSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Specifies the rules through which monitoring signals can trigger actions on the deployment. Rules are combined using 'or'.  */
    private java.util.List<MonitoringRule> _monitoringRules;
    /**
     * Instantiates a new monitoringSettings and sets the default values.
     * @return a void
     */
    public MonitoringSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a monitoringSettings
     */
    @javax.annotation.Nonnull
    public static MonitoringSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonitoringSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MonitoringSettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("monitoringRules", (n) -> { currentObject.setMonitoringRules(n.getCollectionOfObjectValues(MonitoringRule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the monitoringRules property value. Specifies the rules through which monitoring signals can trigger actions on the deployment. Rules are combined using 'or'.
     * @return a monitoringRule
     */
    @javax.annotation.Nullable
    public java.util.List<MonitoringRule> getMonitoringRules() {
        return this._monitoringRules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("monitoringRules", this.getMonitoringRules());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the monitoringRules property value. Specifies the rules through which monitoring signals can trigger actions on the deployment. Rules are combined using 'or'.
     * @param value Value to set for the monitoringRules property.
     * @return a void
     */
    public void setMonitoringRules(@javax.annotation.Nullable final java.util.List<MonitoringRule> value) {
        this._monitoringRules = value;
    }
}
