package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestorSettings implements AdditionalDataHolder, Parsable {
    /** Indicates whether new requests are accepted on this policy. */
    private Boolean _acceptRequests;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers. */
    private java.util.List<UserSet> _allowedRequestors;
    /** Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects. */
    private String _scopeType;
    /**
     * Instantiates a new requestorSettings and sets the default values.
     * @return a void
     */
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
        return this._acceptRequests;
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
     * Gets the allowedRequestors property value. The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers.
     * @return a userSet
     */
    @javax.annotation.Nullable
    public java.util.List<UserSet> getAllowedRequestors() {
        return this._allowedRequestors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RequestorSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("acceptRequests", (n) -> { currentObject.setAcceptRequests(n.getBooleanValue()); });
            this.put("allowedRequestors", (n) -> { currentObject.setAllowedRequestors(n.getCollectionOfObjectValues(UserSet::createFromDiscriminatorValue)); });
            this.put("scopeType", (n) -> { currentObject.setScopeType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the scopeType property value. Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this._scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acceptRequests", this.getAcceptRequests());
        writer.writeCollectionOfObjectValues("allowedRequestors", this.getAllowedRequestors());
        writer.writeStringValue("scopeType", this.getScopeType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptRequests property value. Indicates whether new requests are accepted on this policy.
     * @param value Value to set for the acceptRequests property.
     * @return a void
     */
    public void setAcceptRequests(@javax.annotation.Nullable final Boolean value) {
        this._acceptRequests = value;
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
     * Sets the allowedRequestors property value. The users who are allowed to request on this policy, which can be singleUser, groupMembers, and connectedOrganizationMembers.
     * @param value Value to set for the allowedRequestors property.
     * @return a void
     */
    public void setAllowedRequestors(@javax.annotation.Nullable final java.util.List<UserSet> value) {
        this._allowedRequestors = value;
    }
    /**
     * Sets the scopeType property value. Who can request. One of NoSubjects, SpecificDirectorySubjects, SpecificConnectedOrganizationSubjects, AllConfiguredConnectedOrganizationSubjects, AllExistingConnectedOrganizationSubjects, AllExistingDirectoryMemberUsers, AllExistingDirectorySubjects or AllExternalSubjects.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this._scopeType = value;
    }
}
