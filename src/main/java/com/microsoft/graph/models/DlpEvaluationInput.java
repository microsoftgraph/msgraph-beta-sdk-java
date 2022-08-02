package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DlpEvaluationInput implements AdditionalDataHolder, Parsable {
    /** The accessScope property */
    private AccessScope _accessScope;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The currentLabel property */
    private CurrentLabel _currentLabel;
    /** The discoveredSensitiveTypes property */
    private java.util.List<DiscoveredSensitiveType> _discoveredSensitiveTypes;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new dlpEvaluationInput and sets the default values.
     * @return a void
     */
    public DlpEvaluationInput() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.dlpEvaluationInput");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dlpEvaluationInput
     */
    @javax.annotation.Nonnull
    public static DlpEvaluationInput createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.dlpEvaluationWindowsDevicesInput": return new DlpEvaluationWindowsDevicesInput();
            }
        }
        return new DlpEvaluationInput();
    }
    /**
     * Gets the accessScope property value. The accessScope property
     * @return a accessScope
     */
    @javax.annotation.Nullable
    public AccessScope getAccessScope() {
        return this._accessScope;
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
     * Gets the currentLabel property value. The currentLabel property
     * @return a currentLabel
     */
    @javax.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this._currentLabel;
    }
    /**
     * Gets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @return a discoveredSensitiveType
     */
    @javax.annotation.Nullable
    public java.util.List<DiscoveredSensitiveType> getDiscoveredSensitiveTypes() {
        return this._discoveredSensitiveTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DlpEvaluationInput currentObject = this;
        return new HashMap<>(4) {{
            this.put("accessScope", (n) -> { currentObject.setAccessScope(n.getEnumValue(AccessScope.class)); });
            this.put("currentLabel", (n) -> { currentObject.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
            this.put("discoveredSensitiveTypes", (n) -> { currentObject.setDiscoveredSensitiveTypes(n.getCollectionOfObjectValues(DiscoveredSensitiveType::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessScope", this.getAccessScope());
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
        writer.writeCollectionOfObjectValues("discoveredSensitiveTypes", this.getDiscoveredSensitiveTypes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessScope property value. The accessScope property
     * @param value Value to set for the accessScope property.
     * @return a void
     */
    public void setAccessScope(@javax.annotation.Nullable final AccessScope value) {
        this._accessScope = value;
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
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     * @return a void
     */
    public void setCurrentLabel(@javax.annotation.Nullable final CurrentLabel value) {
        this._currentLabel = value;
    }
    /**
     * Sets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @param value Value to set for the discoveredSensitiveTypes property.
     * @return a void
     */
    public void setDiscoveredSensitiveTypes(@javax.annotation.Nullable final java.util.List<DiscoveredSensitiveType> value) {
        this._discoveredSensitiveTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
