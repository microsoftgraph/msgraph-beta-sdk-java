package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceAttribute implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore object type.
     */
    private AccessPackageResourceAttributeDestination attributeDestination;
    /**
     * The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     */
    private String attributeName;
    /**
     * Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion object type.
     */
    private AccessPackageResourceAttributeSource attributeSource;
    /**
     * Unique identifier for the attribute on the access package resource. Read-only.
     */
    private String id;
    /**
     * Specifies whether or not an existing attribute value can be edited by the requester.
     */
    private Boolean isEditable;
    /**
     * Specifies whether the attribute will remain in the end system after an assignment ends.
     */
    private Boolean isPersistedOnAssignmentRemoval;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new accessPackageResourceAttribute and sets the default values.
     */
    public AccessPackageResourceAttribute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceAttribute
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceAttribute();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attributeDestination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore object type.
     * @return a accessPackageResourceAttributeDestination
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeDestination getAttributeDestination() {
        return this.attributeDestination;
    }
    /**
     * Gets the attributeName property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAttributeName() {
        return this.attributeName;
    }
    /**
     * Gets the attributeSource property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion object type.
     * @return a accessPackageResourceAttributeSource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeSource getAttributeSource() {
        return this.attributeSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("attributeDestination", (n) -> { this.setAttributeDestination(n.getObjectValue(AccessPackageResourceAttributeDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeName", (n) -> { this.setAttributeName(n.getStringValue()); });
        deserializerMap.put("attributeSource", (n) -> { this.setAttributeSource(n.getObjectValue(AccessPackageResourceAttributeSource::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isEditable", (n) -> { this.setIsEditable(n.getBooleanValue()); });
        deserializerMap.put("isPersistedOnAssignmentRemoval", (n) -> { this.setIsPersistedOnAssignmentRemoval(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier for the attribute on the access package resource. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isEditable property value. Specifies whether or not an existing attribute value can be edited by the requester.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEditable() {
        return this.isEditable;
    }
    /**
     * Gets the isPersistedOnAssignmentRemoval property value. Specifies whether the attribute will remain in the end system after an assignment ends.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPersistedOnAssignmentRemoval() {
        return this.isPersistedOnAssignmentRemoval;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attributeDestination", this.getAttributeDestination());
        writer.writeStringValue("attributeName", this.getAttributeName());
        writer.writeObjectValue("attributeSource", this.getAttributeSource());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isEditable", this.getIsEditable());
        writer.writeBooleanValue("isPersistedOnAssignmentRemoval", this.getIsPersistedOnAssignmentRemoval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attributeDestination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore object type.
     * @param value Value to set for the attributeDestination property.
     */
    public void setAttributeDestination(@jakarta.annotation.Nullable final AccessPackageResourceAttributeDestination value) {
        this.attributeDestination = value;
    }
    /**
     * Sets the attributeName property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @param value Value to set for the attributeName property.
     */
    public void setAttributeName(@jakarta.annotation.Nullable final String value) {
        this.attributeName = value;
    }
    /**
     * Sets the attributeSource property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion object type.
     * @param value Value to set for the attributeSource property.
     */
    public void setAttributeSource(@jakarta.annotation.Nullable final AccessPackageResourceAttributeSource value) {
        this.attributeSource = value;
    }
    /**
     * Sets the id property value. Unique identifier for the attribute on the access package resource. Read-only.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isEditable property value. Specifies whether or not an existing attribute value can be edited by the requester.
     * @param value Value to set for the isEditable property.
     */
    public void setIsEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.isEditable = value;
    }
    /**
     * Sets the isPersistedOnAssignmentRemoval property value. Specifies whether the attribute will remain in the end system after an assignment ends.
     * @param value Value to set for the isPersistedOnAssignmentRemoval property.
     */
    public void setIsPersistedOnAssignmentRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.isPersistedOnAssignmentRemoval = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
