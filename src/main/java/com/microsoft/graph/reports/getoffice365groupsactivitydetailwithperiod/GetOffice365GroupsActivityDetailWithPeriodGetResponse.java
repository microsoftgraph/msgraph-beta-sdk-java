package com.microsoft.graph.reports.getoffice365groupsactivitydetailwithperiod;

import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.models.Office365GroupsActivityDetail;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetOffice365GroupsActivityDetailWithPeriodGetResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new GetOffice365GroupsActivityDetailWithPeriodGetResponse and sets the default values.
     */
    public GetOffice365GroupsActivityDetailWithPeriodGetResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetOffice365GroupsActivityDetailWithPeriodGetResponse
     */
    @jakarta.annotation.Nonnull
    public static GetOffice365GroupsActivityDetailWithPeriodGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetOffice365GroupsActivityDetailWithPeriodGetResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(Office365GroupsActivityDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a java.util.List<Office365GroupsActivityDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Office365GroupsActivityDetail> getValue() {
        return this.BackingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<Office365GroupsActivityDetail> value) {
        this.BackingStore.set("value", value);
    }
}
