package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceSubject extends Entity implements Parsable {
    /** The display name of the subject. */
    private String _displayName;
    /** The email address of the user subject. If the subject is in other types, it is empty. */
    private String _email;
    /** The principal name of the user subject. If the subject is in other types, it is empty. */
    private String _principalName;
    /** The type of the subject. The value can be User, Group, and ServicePrincipal. */
    private String _type;
    /**
     * Instantiates a new governanceSubject and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceSubject() {
        super();
        this.setOdataType("#microsoft.graph.governanceSubject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceSubject
     */
    @javax.annotation.Nonnull
    public static GovernanceSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceSubject();
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
     * Gets the email property value. The email address of the user subject. If the subject is in other types, it is empty.
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
        final GovernanceSubject currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { currentObject.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the principalName property value. The principal name of the user subject. If the subject is in other types, it is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this._principalName;
    }
    /**
     * Gets the type property value. The type of the subject. The value can be User, Group, and ServicePrincipal.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email address of the user subject. If the subject is in other types, it is empty.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the principalName property value. The principal name of the user subject. If the subject is in other types, it is empty.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this._principalName = value;
    }
    /**
     * Sets the type property value. The type of the subject. The value can be User, Group, and ServicePrincipal.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
