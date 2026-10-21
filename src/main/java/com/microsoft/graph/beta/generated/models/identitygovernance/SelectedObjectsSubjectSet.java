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
public class SelectedObjectsSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link SelectedObjectsSubjectSet} and sets the default values.
     */
    public SelectedObjectsSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.selectedObjectsSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectedObjectsSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static SelectedObjectsSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectedObjectsSubjectSet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inScopeObjects", (n) -> { this.setInScopeObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inScopeObjects property value. The inScopeObjects property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getInScopeObjects() {
        return this.backingStore.get("inScopeObjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("inScopeObjects", this.getInScopeObjects());
    }
    /**
     * Sets the inScopeObjects property value. The inScopeObjects property
     * @param value Value to set for the inScopeObjects property.
     */
    public void setInScopeObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("inScopeObjects", value);
    }
}
