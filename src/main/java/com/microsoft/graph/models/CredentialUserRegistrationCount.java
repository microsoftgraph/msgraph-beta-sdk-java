package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUserRegistrationCount extends Entity implements Parsable {
    /**
     * Provides the count of users with accountEnabled set to true in the tenant.
     */
    private Long totalUserCount;
    /**
     * A collection of registration count and status information for users in your tenant.
     */
    private java.util.List<UserRegistrationCount> userRegistrationCounts;
    /**
     * Instantiates a new CredentialUserRegistrationCount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CredentialUserRegistrationCount() {
        super();
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("totalUserCount", (n) -> { this.setTotalUserCount(n.getLongValue()); });
        deserializerMap.put("userRegistrationCounts", (n) -> { this.setUserRegistrationCounts(n.getCollectionOfObjectValues(UserRegistrationCount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the totalUserCount property value. Provides the count of users with accountEnabled set to true in the tenant.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalUserCount() {
        return this.totalUserCount;
    }
    /**
     * Gets the userRegistrationCounts property value. A collection of registration count and status information for users in your tenant.
     * @return a UserRegistrationCount
     */
    @javax.annotation.Nullable
    public java.util.List<UserRegistrationCount> getUserRegistrationCounts() {
        return this.userRegistrationCounts;
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
     * Sets the totalUserCount property value. Provides the count of users with accountEnabled set to true in the tenant.
     * @param value Value to set for the totalUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUserCount(@javax.annotation.Nullable final Long value) {
        this.totalUserCount = value;
    }
    /**
     * Sets the userRegistrationCounts property value. A collection of registration count and status information for users in your tenant.
     * @param value Value to set for the userRegistrationCounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRegistrationCounts(@javax.annotation.Nullable final java.util.List<UserRegistrationCount> value) {
        this.userRegistrationCounts = value;
    }
}
