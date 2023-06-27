package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuditUserIdentity extends UserIdentity implements Parsable {
    /**
     * For user sign ins, the identifier of the tenant that the user is a member of.
     */
    private String homeTenantId;
    /**
     * For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     */
    private String homeTenantName;
    /**
     * Instantiates a new AuditUserIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.auditUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditUserIdentity
     */
    @javax.annotation.Nonnull
    public static AuditUserIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditUserIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("homeTenantId", (n) -> { this.setHomeTenantId(n.getStringValue()); });
        deserializerMap.put("homeTenantName", (n) -> { this.setHomeTenantName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the homeTenantId property value. For user sign ins, the identifier of the tenant that the user is a member of.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantId() {
        return this.homeTenantId;
    }
    /**
     * Gets the homeTenantName property value. For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantName() {
        return this.homeTenantName;
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
        writer.writeStringValue("homeTenantId", this.getHomeTenantId());
        writer.writeStringValue("homeTenantName", this.getHomeTenantName());
    }
    /**
     * Sets the homeTenantId property value. For user sign ins, the identifier of the tenant that the user is a member of.
     * @param value Value to set for the homeTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeTenantId(@javax.annotation.Nullable final String value) {
        this.homeTenantId = value;
    }
    /**
     * Sets the homeTenantName property value. For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @param value Value to set for the homeTenantName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeTenantName(@javax.annotation.Nullable final String value) {
        this.homeTenantName = value;
    }
}
