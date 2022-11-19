package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUserRegistrationCount extends Entity implements Parsable {
    /** Provides the total user count in the tenant. */
    private Long _totalUserCount;
    /** A collection of registration count and status information for users in your tenant. */
    private java.util.List<UserRegistrationCount> _userRegistrationCounts;
    /**
     * Instantiates a new CredentialUserRegistrationCount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CredentialUserRegistrationCount() {
        super();
        this.setOdataType("#microsoft.graph.credentialUserRegistrationCount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CredentialUserRegistrationCount
     */
    @javax.annotation.Nonnull
    public static CredentialUserRegistrationCount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUserRegistrationCount();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CredentialUserRegistrationCount currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("totalUserCount", (n) -> { currentObject.setTotalUserCount(n.getLongValue()); });
        deserializerMap.put("userRegistrationCounts", (n) -> { currentObject.setUserRegistrationCounts(n.getCollectionOfObjectValues(UserRegistrationCount::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the totalUserCount property value. Provides the total user count in the tenant.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalUserCount() {
        return this._totalUserCount;
    }
    /**
     * Gets the userRegistrationCounts property value. A collection of registration count and status information for users in your tenant.
     * @return a userRegistrationCount
     */
    @javax.annotation.Nullable
    public java.util.List<UserRegistrationCount> getUserRegistrationCounts() {
        return this._userRegistrationCounts;
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
        writer.writeLongValue("totalUserCount", this.getTotalUserCount());
        writer.writeCollectionOfObjectValues("userRegistrationCounts", this.getUserRegistrationCounts());
    }
    /**
     * Sets the totalUserCount property value. Provides the total user count in the tenant.
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUserCount(@javax.annotation.Nullable final Long value) {
        this._totalUserCount = value;
    }
    /**
     * Sets the userRegistrationCounts property value. A collection of registration count and status information for users in your tenant.
     * @param value Value to set for the userRegistrationCounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRegistrationCounts(@javax.annotation.Nullable final java.util.List<UserRegistrationCount> value) {
        this._userRegistrationCounts = value;
    }
}
