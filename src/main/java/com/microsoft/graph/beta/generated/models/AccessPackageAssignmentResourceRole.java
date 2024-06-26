package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentResourceRole extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageAssignmentResourceRole} and sets the default values.
     */
    public AccessPackageAssignmentResourceRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentResourceRole}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentResourceRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentResourceRole();
    }
    /**
     * Gets the accessPackageAssignments property value. The access package assignments resulting in this role assignment. Read-only. Nullable.
     * @return a {@link java.util.List<AccessPackageAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAccessPackageAssignments() {
        return this.backingStore.get("accessPackageAssignments");
    }
    /**
     * Gets the accessPackageResourceRole property value. The accessPackageResourceRole property
     * @return a {@link AccessPackageResourceRole}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceRole getAccessPackageResourceRole() {
        return this.backingStore.get("accessPackageResourceRole");
    }
    /**
     * Gets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @return a {@link AccessPackageResourceScope}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceScope getAccessPackageResourceScope() {
        return this.backingStore.get("accessPackageResourceScope");
    }
    /**
     * Gets the accessPackageSubject property value. Read-only. Nullable. Supports $filter (eq) on objectId and $expand query parameters.
     * @return a {@link AccessPackageSubject}
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getAccessPackageSubject() {
        return this.backingStore.get("accessPackageSubject");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageAssignments", (n) -> { this.setAccessPackageAssignments(n.getCollectionOfObjectValues(AccessPackageAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRole", (n) -> { this.setAccessPackageResourceRole(n.getObjectValue(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceScope", (n) -> { this.setAccessPackageResourceScope(n.getObjectValue(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageSubject", (n) -> { this.setAccessPackageSubject(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the originId property value. A unique identifier relative to the origin system, corresponding to the originId property of the accessPackageResourceRole.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.backingStore.get("originId");
    }
    /**
     * Gets the originSystem property value. The system where the role assignment is to be created or has been created for an access package assignment, such as SharePointOnline, AadGroup, or AadApplication, corresponding to the originSystem property of the accessPackageResourceRole.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.backingStore.get("originSystem");
    }
    /**
     * Gets the status property value. The value is PendingFulfillment before the access package assignment is delivered to the origin system, and Fulfilled after the access package assignment is delivered to the origin system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignments", this.getAccessPackageAssignments());
        writer.writeObjectValue("accessPackageResourceRole", this.getAccessPackageResourceRole());
        writer.writeObjectValue("accessPackageResourceScope", this.getAccessPackageResourceScope());
        writer.writeObjectValue("accessPackageSubject", this.getAccessPackageSubject());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the accessPackageAssignments property value. The access package assignments resulting in this role assignment. Read-only. Nullable.
     * @param value Value to set for the accessPackageAssignments property.
     */
    public void setAccessPackageAssignments(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this.backingStore.set("accessPackageAssignments", value);
    }
    /**
     * Sets the accessPackageResourceRole property value. The accessPackageResourceRole property
     * @param value Value to set for the accessPackageResourceRole property.
     */
    public void setAccessPackageResourceRole(@jakarta.annotation.Nullable final AccessPackageResourceRole value) {
        this.backingStore.set("accessPackageResourceRole", value);
    }
    /**
     * Sets the accessPackageResourceScope property value. The accessPackageResourceScope property
     * @param value Value to set for the accessPackageResourceScope property.
     */
    public void setAccessPackageResourceScope(@jakarta.annotation.Nullable final AccessPackageResourceScope value) {
        this.backingStore.set("accessPackageResourceScope", value);
    }
    /**
     * Sets the accessPackageSubject property value. Read-only. Nullable. Supports $filter (eq) on objectId and $expand query parameters.
     * @param value Value to set for the accessPackageSubject property.
     */
    public void setAccessPackageSubject(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.backingStore.set("accessPackageSubject", value);
    }
    /**
     * Sets the originId property value. A unique identifier relative to the origin system, corresponding to the originId property of the accessPackageResourceRole.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originId", value);
    }
    /**
     * Sets the originSystem property value. The system where the role assignment is to be created or has been created for an access package assignment, such as SharePointOnline, AadGroup, or AadApplication, corresponding to the originSystem property of the accessPackageResourceRole.
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originSystem", value);
    }
    /**
     * Sets the status property value. The value is PendingFulfillment before the access package assignment is delivered to the origin system, and Fulfilled after the access package assignment is delivered to the origin system.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
