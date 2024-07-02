import { get, post, del, patch } from "../utils/request";

// Bill History
export const createBillHistory = async (billHistory) => {
  try {
    const result = await post("bills/bill-history", billHistory);
    return result;
  } catch (error) {
    console.error("Error creating bill history:");
    throw error;
  }
};

export const getBillHistoryPage = async (billId, page, size) => {
  try {
    const result = await get(
      `bills/bill-history/${billId}?page=${page}&size=${size}`
    );
    return result;
  } catch (error) {
    console.log("Error get Bill History Page : ");
    throw error;
  }
};
