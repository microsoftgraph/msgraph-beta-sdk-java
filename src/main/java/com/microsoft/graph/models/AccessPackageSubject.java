package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageSubject extends Entity implements Parsable {
    /** The altSecId property */
    private String _altSecId;
    /** The connected organization of the subject. Read-only. Nullable. */
    private ConnectedOrganization _connectedOrganization;
    /** The identifier of the connected organization of the subject. */
    private String _connectedOrganizationId;
    /** The display name of the subject. */
    private String _displayName;
    /** The email address of the subject. */
    private String _email;
    /** The object identifier of the subject. null if the subject is not yet a user in the tenant. */
    private String _objectId;
    /** The onPremisesSecurityIdentifier property */
    private String _onPremisesSecurityIdentifier;
    /** The principal name, if known, of the subject. */
    private String _principalName;
    /** The subjectLifecycle property */
    private AccessPackageSubjectLifecycle _subjectLifecycle;
    /** The resource type of the subject. */
    private String _type;
    /**
     * Instantiates a new accessPackageSubject and sets the default values.
     * @return a void
     */
    public AccessPackageSubject() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageSubject");
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
        return this._altSecId;
    }
    /**
     * Gets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @return a connectedOrganization
     */
    @javax.annotation.Nullable
    public ConnectedOrganization getConnectedOrganization() {
        return this._connectedOrganization;
    }
    /**
     * Gets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectedOrganizationId() {
        return this._connectedOrganizationId;
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email address of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageSubject currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("altSecId", (n) -> { currentObject.setAltSecId(n.getStringValue()); });
            this.put("connectedOrganization", (n) -> { currentObject.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
            this.put("connectedOrganizationId", (n) -> { currentObject.setConnectedOrganizationId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("objectId", (n) -> { currentObject.setObjectId(n.getStringValue()); });
            this.put("onPremisesSecurityIdentifier", (n) -> { currentObject.setOnPremisesSecurityIdentifier(n.getStringValue()); });
            this.put("principalName", (n) -> { currentObject.setPrincipalName(n.getStringValue()); });
            this.put("subjectLifecycle", (n) -> { currentObject.setSubjectLifecycle(n.getEnumValue(AccessPackageSubjectLifecycle.class)); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this._objectId;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this._onPremisesSecurityIdentifier;
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this._principalName;
    }
    /**
     * Gets the subjectLifecycle property value. The subjectLifecycle property
     * @return a accessPackageSubjectLifecycle
     */
    @javax.annotation.Nullable
    public AccessPackageSubjectLifecycle getSubjectLifecycle() {
        return this._subjectLifecycle;
    }
    /**
     * Gets the type property value. The resource type of the subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAltSecId(@javax.annotation.Nullable final String value) {
        this._altSecId = value;
    }
    /**
     * Sets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @param value Value to set for the connectedOrganization property.
     * @return a void
     */
    public void setConnectedOrganization(@javax.annotation.Nullable final ConnectedOrganization value) {
        this._connectedOrganization = value;
    }
    /**
     * Sets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @param value Value to set for the connectedOrganizationId property.
     * @return a void
     */
    public void setConnectedOrganizationId(@javax.annotation.Nullable final String value) {
        this._connectedOrganizationId = value;
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject is not yet a user in the tenant.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this._objectId = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this._principalName = value;
    }
    /**
     * Sets the subjectLifecycle property value. The subjectLifecycle property
     * @param value Value to set for the subjectLifecycle property.
     * @return a void
     */
    public void setSubjectLifecycle(@javax.annotation.Nullable final AccessPackageSubjectLifecycle value) {
        this._subjectLifecycle = value;
    }
    /**
     * Sets the type property value. The resource type of the subject.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
