package com.microsoft.graph.models;

import com.microsoft.graph.models.AddFooter;
import com.microsoft.graph.models.AddHeader;
import com.microsoft.graph.models.AddWatermark;
import com.microsoft.graph.models.EncryptContent;
import com.microsoft.graph.models.EncryptWithTemplate;
import com.microsoft.graph.models.EncryptWithUserDefinedRights;
import com.microsoft.graph.models.MarkContent;
import com.microsoft.graph.models.ProtectGroup;
import com.microsoft.graph.models.ProtectOnlineMeetingAction;
import com.microsoft.graph.models.ProtectSite;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LabelActionBase implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new labelActionBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LabelActionBase() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.labelActionBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a labelActionBase
     */
    @javax.annotation.Nonnull
    public static LabelActionBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.addFooter": return new AddFooter();
                case "#microsoft.graph.addHeader": return new AddHeader();
                case "#microsoft.graph.addWatermark": return new AddWatermark();
                case "#microsoft.graph.encryptContent": return new EncryptContent();
                case "#microsoft.graph.encryptWithTemplate": return new EncryptWithTemplate();
                case "#microsoft.graph.encryptWithUserDefinedRights": return new EncryptWithUserDefinedRights();
                case "#microsoft.graph.markContent": return new MarkContent();
                case "#microsoft.graph.protectGroup": return new ProtectGroup();
                case "#microsoft.graph.protectOnlineMeetingAction": return new ProtectOnlineMeetingAction();
                case "#microsoft.graph.protectSite": return new ProtectSite();
            }
        }
        return new LabelActionBase();
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
        final LabelActionBase currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
