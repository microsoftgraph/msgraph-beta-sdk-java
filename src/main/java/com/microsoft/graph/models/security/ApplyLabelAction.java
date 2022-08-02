package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplyLabelAction extends InformationProtectionAction implements Parsable {
    /** The actions property */
    private java.util.List<InformationProtectionAction> _actions;
    /** The actionSource property */
    private ActionSource _actionSource;
    /** The responsibleSensitiveTypeIds property */
    private java.util.List<String> _responsibleSensitiveTypeIds;
    /** The sensitivityLabelId property */
    private String _sensitivityLabelId;
    /**
     * Instantiates a new ApplyLabelAction and sets the default values.
     * @return a void
     */
    public ApplyLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.security.applyLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyLabelAction
     */
    @javax.annotation.Nonnull
    public static ApplyLabelAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyLabelAction();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a informationProtectionAction
     */
    @javax.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this._actions;
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a actionSource
     */
    @javax.annotation.Nullable
    public ActionSource getActionSource() {
        return this._actionSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplyLabelAction currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actions", (n) -> { currentObject.setActions(n.getCollectionOfObjectValues(InformationProtectionAction::createFromDiscriminatorValue)); });
            this.put("actionSource", (n) -> { currentObject.setActionSource(n.getEnumValue(ActionSource.class)); });
            this.put("responsibleSensitiveTypeIds", (n) -> { currentObject.setResponsibleSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sensitivityLabelId", (n) -> { currentObject.setSensitivityLabelId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. The responsibleSensitiveTypeIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResponsibleSensitiveTypeIds() {
        return this._responsibleSensitiveTypeIds;
    }
    /**
     * Gets the sensitivityLabelId property value. The sensitivityLabelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitivityLabelId() {
        return this._sensitivityLabelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeEnumValue("actionSource", this.getActionSource());
        writer.writeCollectionOfPrimitiveValues("responsibleSensitiveTypeIds", this.getResponsibleSensitiveTypeIds());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     * @return a void
     */
    public void setActions(@javax.annotation.Nullable final java.util.List<InformationProtectionAction> value) {
        this._actions = value;
    }
    /**
     * Sets the actionSource property value. The actionSource property
     * @param value Value to set for the actionSource property.
     * @return a void
     */
    public void setActionSource(@javax.annotation.Nullable final ActionSource value) {
        this._actionSource = value;
    }
    /**
     * Sets the responsibleSensitiveTypeIds property value. The responsibleSensitiveTypeIds property
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     * @return a void
     */
    public void setResponsibleSensitiveTypeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._responsibleSensitiveTypeIds = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The sensitivityLabelId property
     * @param value Value to set for the sensitivityLabelId property.
     * @return a void
     */
    public void setSensitivityLabelId(@javax.annotation.Nullable final String value) {
        this._sensitivityLabelId = value;
    }
}
