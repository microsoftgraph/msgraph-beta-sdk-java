package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureADRegistrationPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifiers of the groups that are in the scope of the policy. Either this property or allowedUsers is required when the appliesTo property is set to selected.
     */
    private java.util.List<String> allowedGroups;
    /**
     * The identifiers of users that are in the scope of the policy. Either this property or allowedGroups is required when the appliesTo property is set to selected.
     */
    private java.util.List<String> allowedUsers;
    /**
     * Specifies whether to block or allow fine-grained control of the policy scope. The possible values are: 0 (meaning none), 1 (meaning all), 2 (meaning selected), 3 (meaning unknownFutureValue). The default value is 1. When set to 2, at least one user or group identifier must be specified in either allowedUsers or allowedGroups.  Setting this property to 0 or 1 removes all identifiers in both allowedUsers and allowedGroups.
     */
    private PolicyScope appliesTo;
    /**
     * Specifies whether this policy scope is configurable by the admin. The default value is false. When an admin has enabled Intune (MEM) to manage devices, this property is set to false and appliesTo defaults to 1 (meaning all).
     */
    private Boolean isAdminConfigurable;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new azureADRegistrationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AzureADRegistrationPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureADRegistrationPolicy
     */
    @javax.annotation.Nonnull
    public static AzureADRegistrationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADRegistrationPolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowedGroups property value. The identifiers of the groups that are in the scope of the policy. Either this property or allowedUsers is required when the appliesTo property is set to selected.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedGroups() {
        return this.allowedGroups;
    }
    /**
     * Gets the allowedUsers property value. The identifiers of users that are in the scope of the policy. Either this property or allowedGroups is required when the appliesTo property is set to selected.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedUsers() {
        return this.allowedUsers;
    }
    /**
     * Gets the appliesTo property value. Specifies whether to block or allow fine-grained control of the policy scope. The possible values are: 0 (meaning none), 1 (meaning all), 2 (meaning selected), 3 (meaning unknownFutureValue). The default value is 1. When set to 2, at least one user or group identifier must be specified in either allowedUsers or allowedGroups.  Setting this property to 0 or 1 removes all identifiers in both allowedUsers and allowedGroups.
     * @return a policyScope
     */
    @javax.annotation.Nullable
    public PolicyScope getAppliesTo() {
        return this.appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowedGroups", (n) -> { this.setAllowedGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedUsers", (n) -> { this.setAllowedUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getEnumValue(PolicyScope.class)); });
        deserializerMap.put("isAdminConfigurable", (n) -> { this.setIsAdminConfigurable(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAdminConfigurable property value. Specifies whether this policy scope is configurable by the admin. The default value is false. When an admin has enabled Intune (MEM) to manage devices, this property is set to false and appliesTo defaults to 1 (meaning all).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAdminConfigurable() {
        return this.isAdminConfigurable;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedGroups", this.getAllowedGroups());
        writer.writeCollectionOfPrimitiveValues("allowedUsers", this.getAllowedUsers());
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeBooleanValue("isAdminConfigurable", this.getIsAdminConfigurable());
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
        this.additionalData = value;
    }
    /**
     * Sets the allowedGroups property value. The identifiers of the groups that are in the scope of the policy. Either this property or allowedUsers is required when the appliesTo property is set to selected.
     * @param value Value to set for the allowedGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this.allowedGroups = value;
    }
    /**
     * Sets the allowedUsers property value. The identifiers of users that are in the scope of the policy. Either this property or allowedGroups is required when the appliesTo property is set to selected.
     * @param value Value to set for the allowedUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.allowedUsers = value;
    }
    /**
     * Sets the appliesTo property value. Specifies whether to block or allow fine-grained control of the policy scope. The possible values are: 0 (meaning none), 1 (meaning all), 2 (meaning selected), 3 (meaning unknownFutureValue). The default value is 1. When set to 2, at least one user or group identifier must be specified in either allowedUsers or allowedGroups.  Setting this property to 0 or 1 removes all identifiers in both allowedUsers and allowedGroups.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final PolicyScope value) {
        this.appliesTo = value;
    }
    /**
     * Sets the isAdminConfigurable property value. Specifies whether this policy scope is configurable by the admin. The default value is false. When an admin has enabled Intune (MEM) to manage devices, this property is set to false and appliesTo defaults to 1 (meaning all).
     * @param value Value to set for the isAdminConfigurable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAdminConfigurable(@javax.annotation.Nullable final Boolean value) {
        this.isAdminConfigurable = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
