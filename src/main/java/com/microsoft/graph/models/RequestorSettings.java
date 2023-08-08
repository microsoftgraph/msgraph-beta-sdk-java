package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestorSettings implements AdditionalDataHolder, Parsable {
    /**
     * Indicates whether new requests are accepted on this policy.
     */
    private Boolean acceptRequests;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers.
     */
    private java.util.List<UserSet> allowedRequestors;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects.
     */
    private String scopeType;
    /**
     * Instantiates a new requestorSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RequestorSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requestorSettings
     */
    @javax.annotation.Nonnull
    public static RequestorSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestorSettings();
    }
    /**
     * Gets the acceptRequests property value. Indicates whether new requests are accepted on this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAcceptRequests() {
        return this.acceptRequests;
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
     * Gets the allowedRequestors property value. The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers.
     * @return a userSet
     */
    @javax.annotation.Nullable
    public java.util.List<UserSet> getAllowedRequestors() {
        return this.allowedRequestors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("acceptRequests", (n) -> { this.setAcceptRequests(n.getBooleanValue()); });
        deserializerMap.put("allowedRequestors", (n) -> { this.setAllowedRequestors(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the scopeType property value. Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acceptRequests", this.getAcceptRequests());
        writer.writeCollectionOfObjectValues("allowedRequestors", this.getAllowedRequestors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("scopeType", this.getScopeType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptRequests property value. Indicates whether new requests are accepted on this policy.
     * @param value Value to set for the acceptRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptRequests(@javax.annotation.Nullable final Boolean value) {
        this.acceptRequests = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedRequestors property value. The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers.
     * @param value Value to set for the allowedRequestors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedRequestors(@javax.annotation.Nullable final java.util.List<UserSet> value) {
        this.allowedRequestors = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scopeType property value. Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}
