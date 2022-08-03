package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Option Definition Template */
public class DeviceManagementConfigurationOptionDefinitionTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Option Children */
    private java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> _children;
    /** Option ItemId */
    private String _itemId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceManagementConfigurationOptionDefinitionTemplate and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationOptionDefinitionTemplate() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationOptionDefinitionTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationOptionDefinitionTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationOptionDefinitionTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationOptionDefinitionTemplate();
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
     * Gets the children property value. Option Children
     * @return a deviceManagementConfigurationSettingInstanceTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> getChildren() {
        return this._children;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationOptionDefinitionTemplate currentObject = this;
        return new HashMap<>(3) {{
            this.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
            this.put("itemId", (n) -> { currentObject.setItemId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the itemId property value. Option ItemId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemId() {
        return this._itemId;
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
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the children property value. Option Children
     * @param value Value to set for the children property.
     * @return a void
     */
    public void setChildren(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> value) {
        this._children = value;
    }
    /**
     * Sets the itemId property value. Option ItemId
     * @param value Value to set for the itemId property.
     * @return a void
     */
    public void setItemId(@javax.annotation.Nullable final String value) {
        this._itemId = value;
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
