package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllExcludingSpecificObjectsSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link AllExcludingSpecificObjectsSubjectSet} and sets the default values.
     */
    public AllExcludingSpecificObjectsSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.allExcludingSpecificObjectsSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AllExcludingSpecificObjectsSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static AllExcludingSpecificObjectsSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllExcludingSpecificObjectsSubjectSet();
    }
    /**
     * Gets the excludedObjects property value. The excludedObjects property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getExcludedObjects() {
        return this.backingStore.get("excludedObjects");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludedObjects", (n) -> { this.setExcludedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("excludedObjects", this.getExcludedObjects());
    }
    /**
     * Sets the excludedObjects property value. The excludedObjects property
     * @param value Value to set for the excludedObjects property.
     */
    public void setExcludedObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("excludedObjects", value);
    }
}
