package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageSubject extends Entity implements Parsable {
    /**
     * The altSecId property
     */
    private String altSecId;
    /**
     * The connected organization of the subject. Read-only. Nullable.
     */
    private ConnectedOrganization connectedOrganization;
    /**
     * The identifier of the connected organization of the subject.
     */
    private String connectedOrganizationId;
    /**
     * The display name of the subject.
     */
    private String displayName;
    /**
     * The email address of the subject.
     */
    private String email;
    /**
     * The object identifier of the subject. null if the subject is not yet a user in the tenant.
     */
    private String objectId;
    /**
     * The onPremisesSecurityIdentifier property
     */
    private String onPremisesSecurityIdentifier;
    /**
     * The principal name, if known, of the subject.
     */
    private String principalName;
    /**
     * The subjectLifecycle property
     */
    private AccessPackageSubjectLifecycle subjectLifecycle;
    /**
     * The resource type of the subject.
     */
    private String type;
    /**
     * Instantiates a new accessPackageSubject and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageSubject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageSubject
     */
    @javax.annotation.Nonnull
    public static AccessPackageSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSubject();
    }
    /**
     * Gets the altSecId property value. The altSecId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAltSecId() {
        return this.altSecId;
    }
    /**
     * Gets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @return a connectedOrganization
     */
    @javax.annotation.Nullable
    public ConnectedOrganization getConnectedOrganization() {
        return this.connectedOrganization;
    }
    /**
     * Gets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectedOrganizationId() {
        return this.connectedOrganizationId;
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the email property value. The email address of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("altSecId", (n) -> { this.setAltSecId(n.getStringValue()); });
        deserializerMap.put("connectedOrganization", (n) -> { this.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("connectedOrganizationId", (n) -> { this.setConnectedOrganizationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("subjectLifecycle", (n) -> { this.setSubjectLifecycle(n.getEnumValue(AccessPackageSubjectLifecycle.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this.objectId;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier;
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * Gets the subjectLifecycle property value. The subjectLifecycle property
     * @return a accessPackageSubjectLifecycle
     */
    @javax.annotation.Nullable
    public AccessPackageSubjectLifecycle getSubjectLifecycle() {
        return this.subjectLifecycle;
    }
    /**
     * Gets the type property value. The resource type of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("altSecId", this.getAltSecId());
        writer.writeObjectValue("connectedOrganization", this.getConnectedOrganization());
        writer.writeStringValue("connectedOrganizationId", this.getConnectedOrganizationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeEnumValue("subjectLifecycle", this.getSubjectLifecycle());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the altSecId property value. The altSecId property
     * @param value Value to set for the altSecId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAltSecId(@javax.annotation.Nullable final String value) {
        this.altSecId = value;
    }
    /**
     * Sets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @param value Value to set for the connectedOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedOrganization(@javax.annotation.Nullable final ConnectedOrganization value) {
        this.connectedOrganization = value;
    }
    /**
     * Sets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @param value Value to set for the connectedOrganizationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedOrganizationId(@javax.annotation.Nullable final String value) {
        this.connectedOrganizationId = value;
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this.objectId = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this.onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this.principalName = value;
    }
    /**
     * Sets the subjectLifecycle property value. The subjectLifecycle property
     * @param value Value to set for the subjectLifecycle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectLifecycle(@javax.annotation.Nullable final AccessPackageSubjectLifecycle value) {
        this.subjectLifecycle = value;
    }
    /**
     * Sets the type property value. The resource type of the subject.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
